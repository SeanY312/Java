let data,customers;
async function init(){
  $.ajaxSetup({async: false});
  
  let link = "https://ubiquitous-invention-v6rv445jwg7vcpvvq-8300.app.github.dev";
  let route= "/customers";
  data = await fetch(link+route);
  customers = await data.json();

  generateCards(customers)


}

function generateCards(customers){
  let centerpanel = document.getElementById("centerpanel");
  let front = "";
  let back = "";

  for(let i =0; i < customers.length; i++){
    let customer = customers[i];

    front = `<h1>${customer.FirstName} ${customer.LastName}</h1>`;
    front += `<h2>ID: ${customer.CustomerId}`;
    front += `<h2>Email: ${customer.Email}`;
    
    back = `<h1>Country: ${customer.Country}</h1>`;
    back += `<img src="countries/${customer.Country}.PNG" />`;

    card = new FlipCard(front, back);
    card.render("centerpanel");
  }

    

}

function filter(){
  let country = document.getElementById("country").value;
  console.log(country);

  let customerList = []; //create a list of songs searched for
  
  for(let i=0; i<customers.length;i++){
    let customer = customers[i] //get each sog
    //make sure the list is no
    if( customer.Country == country ) {
          //add to the new list
          customerList.push(customer);
       }
  }
  console.log(`number found ${customerList.length}`)
  generateCards(customerList);
  
}