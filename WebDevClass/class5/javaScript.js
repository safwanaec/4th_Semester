const http=require('http');
const fs = require("fs");

const server = http.createServer((request,response)=>{
    console.log(request.headers);
    const log = `${request.url}:url added\n ${Date.now()}`;
    const html = fs.readFileSync("./index.html");
    fs.appendFile("./log.txt",log,(err)=>{
        response.end(html);
    })
});
server.listen(8000,()=>{
    console.log("400 OK")
});