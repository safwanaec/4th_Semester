package com.bitimage.java;

import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.core.SegwitAddress;
import org.bitcoinj.core.Address;
import org.bitcoinj.crypto.*;
import org.bitcoinj.params.MainNetParams;
import org.bitcoinj.script.Script;
import org.bitcoinj.wallet.DeterministicSeed;
import org.bitcoinj.crypto.HDKeyDerivation;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.List;
public class BitImageGPT {
    public static String imageToAddress(String imagePath, String passphrase) throws Exception {
        NetworkParameters params = MainNetParams.get();
        
        // Read image and convert to Base64
        byte[] imageBytes = Files.readAllBytes(Paths.get(imagePath));
        String base64Data = java.util.Base64.getEncoder().encodeToString(imageBytes);
        
        // Generate SHA-256 hash
        byte[] hashBytes = MessageDigest.getInstance("SHA-256").digest(base64Data.getBytes());
        
        // Create mnemonic using BIP39
        MnemonicCode mnemonicCode = new MnemonicCode();
        List<String> mnemonic = mnemonicCode.toMnemonic(hashBytes);
        
        // Generate seed
        DeterministicSeed seed = new DeterministicSeed(mnemonic, null, passphrase, 0);
        byte[] seedBytes = seed.getSeedBytes();
        
        // Derive root key
        DeterministicKey rootKey = HDKeyDerivation.createMasterPrivateKey(seedBytes);
        
        // Derive path m/84'/0'/0'/0/0
        DeterministicKey childKey = HDKeyDerivation.deriveChildKey(rootKey, new ChildNumber(84, true));
        childKey = HDKeyDerivation.deriveChildKey(childKey, new ChildNumber(0, true));  // Mainnet (0' for mainnet)
        childKey = HDKeyDerivation.deriveChildKey(childKey, new ChildNumber(0, true));  // Account (0' for first account)
        childKey = HDKeyDerivation.deriveChildKey(childKey, new ChildNumber(0, false)); // Change (0 for external addresses)
        childKey = HDKeyDerivation.deriveChildKey(childKey, new ChildNumber(0, false)); // Address index (0 for the first address)
        
        // Generate SegWit address
        Address address = SegwitAddress.fromKey(params, childKey, Script.ScriptType.P2WPKH);
        
        return ((SegwitAddress) address).toBech32(); // Convert the address to bech32 format
    }

    public static void main(String[] args) throws Exception {
        String address = imageToAddress("cats.jpg", "");
        System.out.println("Bitcoin Address: " + address);
    }
}
