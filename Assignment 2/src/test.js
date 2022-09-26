var arr = new Array(2);
arr[0] = new Array(1);
arr[1] = new Array(2);
arr[2] = new Array(3);

for (var i = 0; i < arr.length; i++) {
	for (var j = 0; j < arr[i].length; j++)
		arr[i][j] = i + j;
}

console.log(arr);