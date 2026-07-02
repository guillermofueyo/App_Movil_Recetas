package com.example.practicara2.model

import com.example.practicara2.R

object RepositorioRecetas {

    val recetas: List<Receta> = listOf(

        Receta(
            id = 1,
            nombre = "Tortilla de patatas",
            categoria = "Comida",
            descripcion = "La tortilla española con patata y huevo.",
            ingredientes = listOf(
                "4 huevos",
                "3 patatas medianas",
                "1 cebolla",
                "Aceite de oliva",
                "Sal "
            ),
            pasos = listOf(
                "Pela y corta las patatas en láminas finas.",
                "Pela y pica la cebolla en trozos pequeños.",
                "Fríe las patatas y la cebolla en abundante aceite a fuego medio hasta que estén blandas.",
                "Escurre bien el aceite y mezcla las patatas con los huevos batidos y sal.",
                "Cuaja la tortilla en una sartén antiadherente a fuego bajo por ambos lados."
            ),
            imagen = R.drawable.tortilla
        ),
        Receta(
            id = 2,
            nombre = "Gazpacho andaluz",
            categoria = "Comida",
            descripcion = "Sopa fría de tomate perfecta para el verano.",
            ingredientes = listOf(
                "1 kg de tomates maduros",
                "1 pepino",
                "1 pimiento verde",
                "1 diente de ajo",
                "50 ml de aceite de oliva",
                "2 cucharadas de vinagre",
                "Sal al gusto",
                "Agua fría"
            ),
            pasos = listOf(
                "Lava y trocea todos los vegetales.",
                "Introduce los tomates, el pepino, el pimiento y el ajo en la batidora.",
                "Añade el aceite, el vinagre y la sal.",
                "Tritura hasta obtener una mezcla homogénea.",
                "Agrega agua fría hasta conseguir la textura deseada.",
                "Cuela y refrigera al menos 1 hora antes de servir."
            ),
            imagen = R.drawable.gazpacho
        ),

        Receta(
            id = 3,
            nombre = "Brownie de chocolate",
            categoria = "Postres",
            descripcion = "Brownie húmedo y esponjoso con chocolate negro.",
            ingredientes = listOf(
                "200 g de chocolate negro",
                "150 g de mantequilla",
                "200 g de azúcar",
                "3 huevos",
                "100 g de harina",
                "1 cucharadita de extracto de vainilla",
                "Una pizca de sal"
            ),
            pasos = listOf(
                "Precalienta el horno a 180 °C.",
                "Funde el chocolate con la mantequilla al baño maría.",
                "Mezcla el azúcar con los huevos hasta obtener una crema.",
                "Añade el chocolate fundido a la mezcla de huevos.",
                "Incorpora la harina tamizada, la vainilla y la sal.",
                "Vierte en un molde engrasado y hornea 25 minutos.",
                "Deja enfriar antes de cortar en porciones."
            ),
            imagen = R.drawable.brownie
        ),
        Receta(
            id = 4,
            nombre = "Smoothie de frutas",
            categoria = "Desayuno",
            descripcion = "Batido refrescante con frutas tropicales y yogur.",
            ingredientes = listOf(
                "1 plátano maduro",
                "150 g de fresas",
                "1 mango",
                "200 ml de yogur natural",
                "100 ml de zumo de naranja",
                "Hielo al gusto"
            ),
            pasos = listOf(
                "Pela y trocea el plátano y el mango.",
                "Lava y retira el rabillo de las fresas.",
                "Introduce todas las frutas en la batidora.",
                "Añade el yogur, el zumo de naranja y el hielo.",
                "Tritura hasta obtener una textura cremosa.",
                "Sirve inmediatamente en un vaso alto."
            ),
            imagen = R.drawable.smoothie
        )
    )
    val categorias: List<String>
        get() = recetas.map { it.categoria }.distinct()


    fun buscarPorId(id: Int): Receta? = recetas.find { it.id == id }

}