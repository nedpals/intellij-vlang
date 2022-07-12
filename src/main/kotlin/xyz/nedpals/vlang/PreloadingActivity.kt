package xyz.nedpals.vlang

import com.intellij.openapi.application.PreloadingActivity
import com.intellij.openapi.progress.ProgressIndicator
import org.wso2.lsp4intellij.IntellijLanguageClient
import org.wso2.lsp4intellij.client.languageserver.serverdefinition.ProcessBuilderServerDefinition
import xyz.nedpals.vlang.serverdefinition.RemoteServerDefinition

class PreloadingActivity : PreloadingActivity() {
    override fun preload(indicator: ProgressIndicator) {
        IntellijLanguageClient.addServerDefinition(
                RemoteServerDefinition("v,vsh", "127.0.0.1", 5007)
//                ProcessBuilderServerDefinition("v,vsh", ProcessBuilder("v", "ls", "--debug", "--enable=analyzer_diagnostics"))
        )
    }
}