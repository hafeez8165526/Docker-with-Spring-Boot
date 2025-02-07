db = db.getSiblingDB('admin')
db.createCollection('products')
db.products.insertMany(
    [
        { "name": "hageez" },
        { "name": "sdf" },

        { "name": "sfdwe" },

        { "name": "sdv" },
        { "name": "sef" }

    ]
)