package mx.edu.utng.apppass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_propinas.*

class Propinas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_propinas)

        btnCalcular.setOnClickListener() {
            var cuenta: Double = etxCuenta.text.toString().toDouble();
            var personas: Int = etxPersonas.text.toString().toInt();
            var porcentaje: Int = 0;

            if (rdb15.isChecked) {
                porcentaje = 15;

                var propina = (porcentaje / 100) * cuenta

                if (rdbOpSi.isChecked) {
                    var dividida = (propina + cuenta) / personas
                    Toast.makeText(this, "Calculo Realizando", Toast.LENGTH_LONG).show()
                    txvResultado.text =
                        "Total por persona, incluye propina: $ ${dividida.toString()}"
                } else {
                    var noDividida = propina + cuenta
                    Toast.makeText(this, "Calculo Realizando", Toast.LENGTH_LONG).show()
                    txvResultado.text = "Total con propina: $ ${noDividida.toString()}";
                }

            } else if (rdb20.isChecked) {
                porcentaje = 20;

                var propina = (porcentaje / 100) * cuenta

                if (rdbOpSi.isChecked) {
                    var dividida = (propina + cuenta) / personas
                    Toast.makeText(this, "Calculo Realizando", Toast.LENGTH_LONG).show()
                    txvResultado.text =
                        "Total por persona, incluye propina: $ ${dividida.toString()}"
                } else {
                    var noDividida = propina + cuenta
                    Toast.makeText(this, "Calculo Realizando", Toast.LENGTH_LONG).show()
                    txvResultado.text = "Total con propina: $ ${noDividida.toString()}";
                }

            } else if (rdb25.isChecked) {
                porcentaje = 25;

                var propina = (porcentaje / 100) * cuenta

                if (rdbOpSi.isChecked) {
                    var dividida = (propina + cuenta) / personas
                    Toast.makeText(this, "Calculo Realizando", Toast.LENGTH_LONG).show()
                    txvResultado.text =
                        "Total por persona, incluye propina: $ ${dividida.toString()}"
                } else {
                    var noDividida = propina + cuenta
                    Toast.makeText(this, "Calculo Realizando", Toast.LENGTH_LONG).show()
                    txvResultado.text = "Total con propina: $ ${noDividida.toString()}";
                }

            } else {
                Toast.makeText(this, "No se realizo ningun calculo", Toast.LENGTH_LONG).show()
            }
        }
    }
}

