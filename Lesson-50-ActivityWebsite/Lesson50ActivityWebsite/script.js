
let data,songs;
async function init(){
  let link ="https://ubiquitous-invention-v6rv445jwg7vcpvvq-8500.app.github.dev/" ;
  let route ="tracks";
  info = await fetch(link+route);
  data = await info.json();
  console.log(data);
  generateCards(data);
}
function generateCards(list){
  let output = document.getElementById("output");
  let build = `<div id="bigdiv">`;

  for (let i=0; i<data.length; i++){
    list = data[i];
    build += `<div class="card">`;
    build += `   <h2><strong>Song Name</strong></h2>`;
    build += `   <h3> ${list.Name}</h3>`;
    build += `   <h3><strong>Album</strong></h3>`
    build += `   <p> ${list.Title}</p>`;
    build += `   <h2><strong>Composer</strong></h2>`
    build += `   <p> ${list.Composer}</p>`;
    build += `   <hr>`;
    build += `</div>`;
  }
  build += `</div>`;
  output.innerHTML = build;
}