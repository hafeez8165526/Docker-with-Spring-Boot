db = db.getSiblingDB('admin')
db.createCollection('employee')
db.employee.insertMany(
    [
        { "name": "hageez" },
        { "name": "sdf" },

        { "name": "sfdwe" },

        { "name": "sdv" },
        { "name": "sef" }

    ]
)