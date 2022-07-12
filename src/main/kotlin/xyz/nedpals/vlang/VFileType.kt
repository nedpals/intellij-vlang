package xyz.nedpals.vlang

import com.intellij.openapi.fileTypes.LanguageFileType
import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable
import javax.swing.Icon

class VFileType : LanguageFileType(VLanguage.INSTANCE) {
    companion object {
        val INSTANCE = VFileType()
    }

    @NotNull
    override fun getName(): String {
        return "V"
    }

    @NotNull
    override fun getDescription(): String {
        return "V language file"
    }

    @NotNull
    override fun getDefaultExtension(): String {
        return "v"
    }

    @Nullable
    override fun getIcon(): Icon? {
        return null
    }
}