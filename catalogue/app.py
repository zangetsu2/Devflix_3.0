from flask import Flask, jsonify
from flask_pymongo import PyMongo
import os

app = Flask(__name__)
app.config["MONGO_URI"] = os.getenv("MONGO_URI", "mongodb://mongo:27017/devflix")
mongo = PyMongo(app)

@app.route('/movies')
def movies():
    data = list(mongo.db.movies.find({}, {"_id": 0}))
    return jsonify(data), 200

if __name__ == "__main__":
    port = int(os.getenv("PORT", 5000))
    app.run(host="0.0.0.0", port=port)