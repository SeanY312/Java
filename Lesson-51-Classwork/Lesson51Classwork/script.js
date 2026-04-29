
let employees;
async function init(){
  //$.ajaxSetup({async: false});
  
  let link = "https://ubiquitous-invention-v6rv445jwg7vcpvvq-8500.app.github.dev";
  let route= "/employees";
  let info = await fetch(link+route);
  employees = await info.json();

  generateCards(employees);

  
}

function generateCards(employees){

  let output = document.getElementById("output");
  let build ="";

   
  for(let i=0; i<employees.length; i++){
    let employee = employees[i];
    build += `<div class="card" >`;
    build += `<h3> Employee ID : ${employee.EmployeeId}</h3>`;
    build += `<div> First Name : ${employee.FirstName}</div>`;
    build += `<div> Last Name : ${employee.LastName}</div>`;
    build += `<p> City : ${employee.City}</p>`;
    build += `<hr>`;
    build += `</div>`;
  }
  output.innerHTML = build;
}

  function filter(){
    let newEmployees = [];
    let list = "";
    let textValue = document.getElementById("textValue").value;

    for(let i=0; i < employees.length; i ++){
      list = employees[i];
      console.log(list.FirstName);
      console.log(textValue);
      if(list.FirstName == textValue){
        console.log(list.FirstName == textValue);
        console.log(newEmployees);
        newEmployees.push(list);
        console.log(newEmployees);
      }
    }
    output.innerHTML = newEmployees;
    output.innerHTML = generateCards(newEmployees);
  }
