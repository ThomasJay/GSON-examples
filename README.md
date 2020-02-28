# GSON-examples
Examples of mapping Java to Json and Json to Java using GSON library


# Notes

You can map a Java object to a json string using this library and map a string to a Java object.

You can use the pretty print to format json, this looks good but is not really needed.

You can write to a file or read from a file or stream.

Simply create a Map of String,Object and then you can map a new object in a few lines of code.

If you wish you can change the name of an element for example if the json has a reserve word then map to a valid attribute name.



# Output
jsonStr={"address":{"zip":"94040","address2":"Apt 22","city":"San Francisco","address1":"100 A Street","state":"CA"},"name":"Tom","active":true,"id":"111-222-333","age":25,"directive":325.66,"timestamp":1582926943474}

prettyJsonStr={
  "address": {
    "zip": "94040",
    "address2": "Apt 22",
    "city": "San Francisco",
    "address1": "100 A Street",
    "state": "CA"
  },
  "name": "Tom",
  "active": true,
  "id": "111-222-333",
  "age": 25,
  "directive": 325.66,
  "timestamp": 1582926943474
}

nothing set myObjectStr={"items":[]}

attributes set myObjectStr={"myobjectId":"112233","name":"Tom","items":["One","Two"]}

myObject.id=112233
myObject.name=Fred

Hope this saves you some time.

Thanks, Tom
thomasjay200@gmail.com



