package com.nao20010128nao.FtpHelper

import org.apache.ftpserver.ftplet.Authentication
import org.apache.ftpserver.ftplet.User
import org.apache.ftpserver.usermanager.impl.AbstractUserManager

class QuickUserManager(private val users: Map<String, String>) : AbstractUserManager() {
    override fun save(user: User) {}

    override fun getUserByName(username: String): User? = if (users.containsKey(username)) {
        QuickUser(username, users.getValue(username))
    } else {
        null
    }

    override fun authenticate(authentication: Authentication): User {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun doesExist(username: String?): Boolean = users.containsKey(username)

    override fun getAllUserNames(): Array<String> = users.keys.toTypedArray()

    override fun delete(username: String?) {}
}