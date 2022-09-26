module.exports = {
    readFile: readFile
}

function readFile(file)
{
    var text;
    var lines = new Array();
    var rows = new Array();
    var filesystem = require('fs');

    text = filesystem.readFileSync(file);
    lines = text.toString().split("\n");

    for (var r = 0; r < lines.length; r++) {
        rows[r] = lines[r].split(",");
	for (var c = 0; c < rows[r].length; c++){
	    rows[r][c] = parseInt( rows[r][c] );
	}
    }
    return rows;
}
