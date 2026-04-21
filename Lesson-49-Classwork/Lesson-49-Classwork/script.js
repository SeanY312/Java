
let employees;
async function init(){
  
  let link = "https://ubiquitous-invention-v6rv445jwg7vcpvvq-8300.app.github.dev";
  let route= "/employees"
  info = await fetch(link+route);
  employees = await info.json();

  let output = ""
  let build ="";

   

  


}