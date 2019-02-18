

function getOperation(){
    var operation = event.target.id;
    var n1 = document.getElementById("n1").value;
    var n2 = document.getElementById("n2").value;
    
    var URL = `calculator?operation=${operation}&n1=${n1}&n2=${n2}`
            
            fetch(URL) 
                .then(res=>res.text())
                .then(d =>{ document.getElementById("result").innerText = d})
}

document.getElementById("buttons").addEventListener("click", getOperation);