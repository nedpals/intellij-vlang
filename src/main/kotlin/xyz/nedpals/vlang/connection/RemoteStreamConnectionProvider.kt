package xyz.nedpals.vlang.connection

import com.intellij.openapi.diagnostic.Logger
import org.wso2.lsp4intellij.client.connection.StreamConnectionProvider
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.net.Socket

class RemoteStreamConnectionProvider(socket: Socket) : StreamConnectionProvider {
    private val internalSocket : Socket
    private val logger : Logger

    init {
        internalSocket = socket
        logger = Logger.getInstance(RemoteStreamConnectionProvider::class.java)
    }

    override fun start() {
        if (!internalSocket.isConnected) {
            throw IOException("Unable to start language server: $this")
        } else {
            logger.info("Remote connection started")
        }
    }

    override fun getInputStream(): InputStream {
        return internalSocket.getInputStream()
    }

    override fun getOutputStream(): OutputStream {
        return internalSocket.getOutputStream()
    }

    override fun stop() {
        if (internalSocket.isConnected) {
            internalSocket.close()
        }
    }
}