package io.github.aidenkoog.androidpractice.android.sealed_class

/*
 * sealed class example.
 */
sealed class Item(
    val iconResId: Int,
    val titleResId: Int,
    val descResId: Int,
    var state: Boolean,
) {
    class SubItem1(
        iconId: Int,
        titleId: Int,
        descId: Int,
    ) : Item(iconId, titleId, descId, false)

    class SubItem2(
        iconId: Int,
        titleId: Int,
        descId: Int,
        state: Boolean,
    ) : Item(iconId, titleId, descId, state)

    class SubItem3(
        iconId: Int,
        titleId: Int,
        descId: Int,
    ) : Item(iconId, titleId, descId, true)
}