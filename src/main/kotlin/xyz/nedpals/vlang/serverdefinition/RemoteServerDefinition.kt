package xyz.nedpals.vlang.serverdefinition

import org.wso2.lsp4intellij.client.connection.StreamConnectionProvider
import org.wso2.lsp4intellij.client.languageserver.serverdefinition.LanguageServerDefinition
import java.net.Socket
import java.util.Collections
import xyz.nedpals.vlang.connection.RemoteStreamConnectionProvider

class RemoteServerDefinition(ext: String, languageIds: Map<String, String>, host: String, port: Int) : LanguageServerDefinition() {
    val socket : Socket

    constructor(ext: String, host: String, port: Int) : this(ext, Collections.emptyMap(), host, port)

    init {
        socket = Socket(host, port)
        super.ext = ext
        super.languageIds = languageIds
    }

    override fun createConnectionProvider(workingDir: String?): StreamConnectionProvider {
        return RemoteStreamConnectionProvider(socket)
    }

    override fun equals(other: Any?): Boolean {
        if (other is RemoteServerDefinition) {
            return ext.equals(other.ext) && socket == other.socket
        }
        return false
    }

    override fun hashCode(): Int {
        return ext.hashCode() + 3 * socket.hashCode()
    }
}