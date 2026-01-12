const app = require("./app");

port = process.env.PORT || 3000;

app.listen(port, "0.0.0.0", () => {
	// Keep the server start log short and useful.
	console.log(`Quote service listening on http://0.0.0.0:${port}`);
});
