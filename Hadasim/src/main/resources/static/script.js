//var selectedRow = null;
function addClient(){
    // window.location = '/client'
    //event.preventDefault();
    const a = readData();
    insertData(a);
    // }
    // else {
    //     updateData(fromData);
    // }
    //resetData();
}

 function readData(){
    var fromData = {};
    fromData["firstName"] = document.getElementById("firstName").value;
    fromData["lastName"] = document.getElementById("lastName").value;
    fromData["id"] = document.getElementById("id").value;
    fromData["coronaVaccine"] = document.getElementById("coronaVaccine").value;
    fromData["possiveAnswer"] = document.getElementById("possiveAnswer").value;
    fromData["Recovery"] = document.getElementById("Recovery").value;
    return fromData;
 }

 function insertData(data){
    var table = document.getElementById("clientsList").getElementsByTagName("tbody")[0];
    var newRow = table.insertRow(table.length);
    var cellOne = newRow.insertCell(0);
    cellOne.innerHTML = data.firstName;
    var cellTwo = newRow.insertCell(1);
    cellTwo.innerHTML = data.lastName;
    var cellThree = newRow.insertCell(2);
    cellThree.innerHTML = data.id;
    var cellFour = newRow.insertCell(3);
    cellFour.innerHTML = data.coronaVaccine;
    var cellFive = newRow.insertCell(4);
    cellFive.innerHTML = data.possiveAnswer;
    var cellSix = newRow.insertCell(5);
    cellSix.innerHTML = data.Recovery;
    var cellSeven = newRow.insertCell(6);
    cellSeven.innerHTML = <button onClicl="editData(this)">Edit</button>, <button onClick="deleteData(this)">Delete</button>;
 }

 function editData(td){
    selectedRow = td.parentElement.parentElement;
    document.getElementById( "firstName").value = selectedRow.cells[0].innerHTML;
    document.getElementById("lasttName").value = selectedRow.cells[1].innerHTML;
    document.getElementById("id").value = selectedRow.cells[2].innerHTML;
    document.getElementById("coronaVaccine").value = selectedRow.cells[3].innerHTML;
    document.getElementById("possiveAnswer").value = selectedRow.cells[4].innerHTML;
    document.getElementById("Recovery").value = selectedRow.cells[5].innerHTML;
 }

 function updateData(fromData) {
     selectedRow.cells[0].innerHTML = fromData.firstName;
     selectedRow.cells[1].innerHTML = fromData.lastName;
     selectedRow.cells[2].innerHTML = fromData.id;
     selectedRow.cells[3].innerHTML = fromData.coronaVaccine;
     selectedRow.cells[4].innerHTML = fromData.possiveAnswer;
     selectedRow.cells[5].innerHTML = fromData.Recovery;
 }

 function deleteData(td) {
     if (confirm("Do you want to delete?")) {
         row = td.parentElement.parentElement;
         document.getElementById("clientsList").deleteRow(row.rowIndex);
     }
     resetData();
 }

 // function resetData() {
 //     document.getElementById("firstName").value = "";
 //     document.getElementById("lastName").value = "";
 //     document.getElementById("id").value = "";
 //     document.getElementById("coronaVaccine").value = "";
 //     document.getElementById("possiveAnswer").value = "";
 //     document.getElementById("Recovery").value = "";
 // }

