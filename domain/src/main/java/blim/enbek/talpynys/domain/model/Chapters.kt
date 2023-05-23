package blim.enbek.talpynys.domain.model


import com.google.gson.annotations.SerializedName

data class Chapters(
    @SerializedName("chapters")
    val chapters: List<Chapter>
) {
    data class Chapter(
        @SerializedName("bismillah_pre")
        val bismillahPre: Boolean, // false
        @SerializedName("id")
        val id: Int, // 1
        @SerializedName("name_arabic")
        val nameArabic: String, // الفاتحة
        @SerializedName("name_complex")
        val nameComplex: String, // Al-Fātiĥah
        @SerializedName("name_simple")
        val nameSimple: String, // Al-Fatihah
        @SerializedName("pages")
        val pages: List<Int>,
        @SerializedName("revelation_order")
        val revelationOrder: Int, // 5
        @SerializedName("revelation_place")
        val revelationPlace: String, // makkah
        @SerializedName("translated_name")
        val translatedName: TranslatedName,
        @SerializedName("verses_count")
        val versesCount: Int // 7
    ) {
        data class TranslatedName(
            @SerializedName("language_name")
            val languageName: String, // english
            @SerializedName("name")
            val name: String // The Opener
        )
    }
}