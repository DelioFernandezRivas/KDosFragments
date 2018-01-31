package com.ejemplos.dam.dosfragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
// para poder acceder a los elementos del layout
import kotlinx.android.synthetic.main.fragment_main.*
// libreria Anko para facilitar (aún mas) código
import org.jetbrains.anko.support.v4.toast

/**
 * Fragment que vamos incluir en la Activity principal [Fragment subclass]
 */
class MainFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    /**
     * Cargamos el layout del fragment
     */
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_main, container)
    }

    /**
     * Una vez cargado el layout podemos utilizar sus elementos
     */
    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // añadimos funcionalidad al boton
        main_button.setOnClickListener {
            // Mostramos una toast
            // Para utilizar este método necesitamos la librería Anko que completa las funcionalidades de Kotlin
            // https://github.com/Kotlin/anko
            // es necesario
            toast("Mensaje: ${main_editText.text}")
            // mostramos en el TextView lo que introducimos en el EditText
            main_textview.text = main_editText.text
        }
    }
}
