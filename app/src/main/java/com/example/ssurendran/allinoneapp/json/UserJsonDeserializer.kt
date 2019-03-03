package com.example.ssurendran.allinoneapp.json

import com.example.ssurendran.allinoneapp.model.User
import com.google.gson.*
import java.lang.reflect.Type

class UserJsonDeserializer: JsonDeserializer<User> {
    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): User {
        var userJsonObj: JsonElement? = json?.asJsonObject?.get("data")
        return Gson().fromJson(userJsonObj, User::class.java)
    }
}