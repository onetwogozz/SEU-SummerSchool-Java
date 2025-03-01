package app.vcampus.client.repository

import app.vcampus.server.entity.User
import app.vcampus.client.gateway.AuthClient
import app.vcampus.client.net.NettyHandler

object FakeRepository {
    private lateinit var handler: NettyHandler;
    lateinit var user: User;

    fun setHandler(handler: NettyHandler) {
        this.handler = handler
    }

    fun login(username: String, password: String): Boolean {
        val user = AuthClient.login(handler, username, password)

        user?.let {
            print(it)
            this.user = it
            return true
        }

        return false
    }
}