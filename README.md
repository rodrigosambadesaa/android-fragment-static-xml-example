# Static XML Fragment Example

Modernización de uno de los ejemplos docentes de 2019 sobre Fragments en Android.

## Qué demuestra

Este proyecto declara el `Fragment` directamente en XML. La versión actual usa `FragmentContainerView` como host recomendado por AndroidX.

La interfaz permite escribir un mensaje y pulsar **Procesar**; el Fragment muestra cuántos caracteres se han introducido. Esa pequeña interacción hace verificable el ciclo de vida de la vista en los tres ejemplos.

## Mejoras

- `androidx.fragment.app.Fragment` en lugar del Fragment de plataforma.
- Java 17, AGP 9.3.0, Gradle 9.5.0 y compile/target SDK 37.
- AppCompat 1.8.0 y minSdk 23.
- View Binding en la vista del Fragment, liberado en `onDestroyView()`.
- Strings en recursos.
- Lógica de conteo separada y probada con JUnit.
- GitHub Actions con tests, lint y build.

Consulte [`docs/ORIGINAL_REVIEW.md`](docs/ORIGINAL_REVIEW.md) para la comparación con el ejemplo histórico.
