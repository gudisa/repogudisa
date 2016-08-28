<!DOCTYPE html>
<html>
<body>

<p id="demo"></p>

<script>
function funName(x)
{  var y=x;
	document.write("raja"+y.length);
	}
var cars = ["BMW", "Volvo", "Saab", "Ford"];
var text = "";
var i;
for (i = 0; i < cars.length; i++) {
    text += cars[i] + "<br>";
}

document.getElementById("demo").innerHTML = text;
funName("raja");
</script>

</body>
</html>
