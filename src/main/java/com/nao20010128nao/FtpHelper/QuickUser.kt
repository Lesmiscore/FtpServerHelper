package com.nao20010128nao.FtpHelper

import org.apache.ftpserver.ftplet.Authority
import org.apache.ftpserver.ftplet.AuthorizationRequest
import org.apache.ftpserver.ftplet.User

class QuickUser(private val name: String, private val password: String) : User {
    override fun getAuthorities(): MutableList<out Authority> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAuthorities(clazz: Class<out Authority>?): List<Authority> = emptyList()

    override fun getPassword(): String = password

    override fun getName(): String = name

    override fun getEnabled(): Boolean = true

    override fun authorize(request: AuthorizationRequest): AuthorizationRequest = request

    override fun getHomeDirectory(): String = "/"

    override fun getMaxIdleTime(): Int = 0
}