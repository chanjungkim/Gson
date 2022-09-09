HOW TO USE:

```
        val json = "[{\"name\":\"evan\", \"level\": 1}, {\"name\":\"hazel\", \"level\": 2}, {\"name\":\"mason\", \"level\": 3}]"

        val myArrayList = Gson().fromJsonToArrayList(json, TestModel::class.java)
```
