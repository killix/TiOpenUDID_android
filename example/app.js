var window = Ti.UI.createWindow({
	backgroundColor: 'white'
}),
label = Ti.UI.createLabel();

window.addEventListener('open', function () {
	OpenUDID = require('net.iamyellow.TiOpenUDID');
	Ti.API.info('****** ' + OpenUDID.uniqueID);
	label.text = OpenUDID.uniqueID;
});

window.add(label);
window.open();