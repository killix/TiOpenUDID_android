var window = Ti.UI.createWindow({
	backgroundColor: 'white'
}),
label = Ti.UI.createLabel(),
OpenUDID = require('net.iamyellow.TiOpenUDID');

label.text = OpenUDID.uniqueID;

window.add(label);
window.open();