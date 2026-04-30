let data,customers;
async function init(){
  let link = "https://ubiquitous-invention-v6rv445jwg7vcpvvq-8300.app.github.dev/";
  let route = "employees";
  let info = await fetch(link+route);
  customers = info.json();
  
  //console.log(customers);
  //generateCards(customers);

  
}
function generateCards(list){
  let bld = "";
  let cust;
  let textBox = document.getElementById("firstBox");
  let output = document.getElementById("mainpanel");
  for(let i=0; i < list.length; i++){
    cust = list[i];
    if(firstBox==cust.FirstName){
      bld += `<h1>First Name: ${list.FirstName}`;
      bld += `<h2>Last Name: ${list.LastName}`;
      bld += `<h3>City: ${list.City}`;
      bld += `<img src="${list.Country}.PNG">`;
    }
  }
  output.innerHTML = bld;
}
