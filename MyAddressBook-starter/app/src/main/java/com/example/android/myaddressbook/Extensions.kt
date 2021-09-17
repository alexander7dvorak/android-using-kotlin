internal inline fun EditText.validateWith
            (passIcon: Drawable? = ContextCompat.getDrawable(context, R.drawable.ic_pass),
             failIcon: Drawable? = ContextCompat.getDrawable(context, R.drawable.ic_fail),
             validator: TextView.() -> Boolean): Boolean {
    setCompoundDrawablesWithIntrinsicBounds(null, null,
        if (validator()) passIcon else failIcon, null)
    return validator()
}