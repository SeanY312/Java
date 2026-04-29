let data,customers;
async function init(){
  let link = "https://ubiquitous-invention-v6rv445jwg7vcpvvq-8500.app.github.dev/";
  let route = "employees";
  let info = await fetch(link+route);
  customers = await info.json();
  
  console.log(customers);

  
}
generateCards(list){
  let bld = "";

  bld += `<h1>First Name: ${list.FirstName}`;
  bld += `<h2>Last Name: ${list.LastName}`;
  bld += `<h3>City: ${list.City}`;
  bld += `<img src="${list.Country}.PNG">`;

}
