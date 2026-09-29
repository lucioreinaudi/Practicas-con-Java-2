package com.example.lote;

public class Main {
    public static void main(String[] args) {

        // 1. Arreglo de Leches
        Leche[] leches = {
                new Leche("Leche Entera Pasterizada", "Tambo San José", 500, "Litros", 1.20, 3.6, true, "Cuenca Abasto"),
                new Leche("Leche Descremada", "Cooperativa La Unión", 300, "Litros", 1.10, 1.5, true, "Cuenca Centro"),
                new Leche("Leche Cruda a Granel", "Don Roque S.A.", 1200, "Litros", 0.95, 3.8, false, "Cuenca Sur")
        };

        // 2. Arreglo de Chacinados
        Chacinado[] chacinados = {
                new Chacinado("Salame Tradicional", "Estancia Chica", 50, "Unidades", 15.00, 45, true, "Salame"),
                new Chacinado("Jamón Crudo Estacionado", "Granja Don Mario", 20, "Kg", 28.00, 90, false, "Jamón"),
                new Chacinado("Longaniza Napolitana", "Embutidos El Abuelo", 40, "Unidades", 12.50, 15, true, "Embutido")
        };

        // 3. Arreglo de Maderas
        Madera[] maderas = {
                new Madera("Rollo de Pino Elliottii", "Forestal Argentina", 100, "m3", 120.00, "Pino", 5.0, true),
                new Madera("Tablas de Eucalipto Grandis", "Maderas del Litoral", 80, "m3", 150.00, "Eucalipto", 3.5, false),
                new Madera("Tirantes de Roble Blanco", "Bosques Nativos", 50, "m3", 220.00, "Roble", 2.0, true)
        };

        System.out.println("==========================================");
        System.out.println("   EVALUACIÓN DE LOTES - CONTROL DE CALIDAD");
        System.out.println("==========================================\n");

        // --- RECORRIDO Y CONTROL DE LECHES ---
        System.out.println("--- Evaluando Lotes de Leche ---");
        for (int i = 0; i < leches.length; i++) {
            Leche leche = leches[i];
            double valorTotal = leche.calcularValor();

            System.out.println("Objeto a evaluar: " + leche.getNombre() + " | Productor: " + leche.getSocioProductor());
            System.out.println("  - Grasa: " + leche.getPorcetajeGrasa() + "% | Refrigerada: " + (leche.isEsRefrigerada() ? "Sí" : "No"));
            System.out.println("  - Valor calculado: $" + valorTotal);

            // Criterio de Calidad: Debe estar refrigerada y tener un porcentaje de grasa mínimo aceptable (>= 2.0%)
            if (leche.isEsRefrigerada() && leche.getPorcetajeGrasa() >= 2.0) {
                System.out.println("  -> ESTADO: ACEPTADO. Se introduce efectivamente al lote de calidad.");
            } else {
                System.out.println("  -> ESTADO: RECHAZADO. No cumple con las condiciones mínimas de calidad.");
            }
            System.out.println();
        }

        // --- RECORRIDO Y CONTROL DE CHACINADOS ---
        System.out.println("--- Evaluando Lotes de Chacinados ---");
        for (int i = 0; i < chacinados.length; i++) {
            Chacinado chacinado = chacinados[i];
            double valorTotal = chacinado.calcularValor();

            System.out.println("Objeto a evaluar: " + chacinado.getNombre() + " | Productor: " + chacinado.getSocioProductor());
            System.out.println("  - Días de estacionamiento: " + chacinado.getDiasEstacionamiento() + " | Artesanal: " + (chacinado.isEsArtesanal() ? "Sí" : "No"));
            System.out.println("  - Valor calculado: $" + valorTotal);

            // Criterio de Calidad: Debe contar con al menos 30 días de estacionamiento
            if (chacinado.getDiasEstacionamiento() >= 30) {
                System.out.println("  -> ESTADO: ACEPTADO. Se introduce efectivamente al lote de calidad.");
            } else {
                System.out.println("  -> ESTADO: RECHAZADO. Días de estacionamiento insuficientes.");
            }
            System.out.println();
        }

        // --- RECORRIDO Y CONTROL DE MADERAS ---
        System.out.println("--- Evaluando Lotes de Madera ---");
        for (int i = 0; i < maderas.length; i++) {
            Madera madera = maderas[i];
            double valorTotal = madera.calcularValor();

            System.out.println("Objeto a evaluar: " + madera.getNombre() + " | Productor: " + madera.getSocioProductor());
            System.out.println("  - % Merma: " + madera.getPorcentajeMerma() + "% | Certificada: " + (madera.isEsCertificada() ? "Sí" : "No"));
            System.out.println("  - Valor calculado: $" + valorTotal);

            // Criterio de Calidad: Estar certificada y tener una merma inferior o igual al 4%
            if (madera.isEsCertificada() && madera.getPorcentajeMerma() <= 4.0) {
                System.out.println("  -> ESTADO: ACEPTADO. Se introduce efectivamente al lote de calidad.");
            } else {
                System.out.println("  -> ESTADO: RECHAZADO. Excede la merma permitida o carece de certificación.");
            }
            System.out.println();
        }
    }
}