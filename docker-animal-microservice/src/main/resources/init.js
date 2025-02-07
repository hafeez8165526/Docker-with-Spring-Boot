db = db.getSiblingDB('admin')
db.createCollection('animal')
db.animal.insertMany(
	[
		{ "name": "cat" },
		{ "name": "dog" },

		{ "name": "tiger" }


	]
)