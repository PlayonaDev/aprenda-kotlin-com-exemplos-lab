//  A DIO possui Formacoes incríveis que têm como objetivo oferecer um conjunto de ConteudosEducacionais
//  voltados para uma stack tecnológica específica, preparando profissionais de TI para o mercado de trabalho.
//  Formacoes possuem algumas características importantes, como nome, nivel e seus respectivos conteudosEducacionais.
//  Além disso, tais experiências educacionais têm um comportamento relevante ao nosso domínio,
//  definido pela capacidade de matricular um ou mais Alunos.

// 1 - Criar a capacidade de matricular um ou mais Alunos; - Concluido
// 2 - Voltados para uma Stack tecnológica específica - Back-end; 
// 3 - Formações possuem característica importantes: nome, nvl e seus respectivos conteudosEducacionais.


enum class Nivel { BASICO, INTERMEDIARIO, AVANCADA }

data class Aluno(val nome: String, val idade: Int)

data class ConteudoEducacional(val nome: String, val descricao: String)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {
    // Lista de alunos matriculados na formação
    val inscritos = mutableListOf<Aluno>()
    
    // Método para matriculkar um aluno na formação
    fun matricular(aluno: Aluno) {
        inscritos.add(aluno)
        println("Aluno ${aluno.nome} matriculado na formação $nome")
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    // Criar os conteúdos educacionais
    val conteudo1 = ConteudoEducacional("Introdução Kotlin", "Aprenda os conceitos sobre Kotlin.")
    val conteudo2 = ConteudoEducacional("Desenvolvimento de Apps", "Aprenda a criar aplicativos.")
    val conteudo3 = ConteudoEducacional("Banco de Dados", "Aprenda a trabalhar com bancos de dados.")

    // Criar formação com esses conteúdos (nível básico)
    val formacaoBasica = Formacao("Básica - Desenvolvedor Android", Nivel.BASICO, listOf(conteudo1, conteudo2))

    // Criar formação com esses conteúdos (nível intermediário)
    val formacaoIntermediaria = Formacao("Intermediária - Desenvolvedor Android", Nivel.INTERMEDIARIO, listOf(conteudo2, conteudo3))

    // Criar formação com esses conteúdos (nível Avançado)
    val formacaoAvancada = Formacao("Avançada - Desenvolvedor Android", Nivel.AVANCADA, listOf(conteudo1, conteudo2, conteudo3))

    // Criar alguns alunos
    val aluno1 = Aluno("Vitor Augusto", 26)
    val aluno2 = Aluno("Karime Cristina", 22)
    val aluno3 = Aluno("Geovanna Richard", 30)

    // Matricular os alunos nas formações
    formacaoBasica.matricular(aluno1)
    formacaoAvancada.matricular(aluno2)

    formacaoIntermediaria.matricular(aluno2)
    formacaoIntermediaria.matricular(aluno3)

    // Exibir informações sobre as formações e os alunos matriculados
    println("-----------------------------------------------------")
    
    println("Formação: ${formacaoBasica.nome}, Nível: ${formacaoBasica.nivel}")
    println("Formação: ${formacaoIntermediaria.nome}, Nível: ${formacaoIntermediaria.nivel}")
    println("Formação: ${formacaoAvancada.nome}, Nível: ${formacaoAvancada.nivel}")
    
    println("-----------------------------------------------------")
    
    println("Conteúdos Educacionais:")
    for (conteudo in formacaoBasica.conteudos) {
        println("- ${conteudo.nome}: ${conteudo.descricao}")
    }
    for (conteudo in formacaoIntermediaria.conteudos) {
        println("- ${conteudo.nome}: ${conteudo.descricao}")
    }
    for (conteudo in formacaoAvancada.conteudos) {
        println("- ${conteudo.nome}: ${conteudo.descricao}")
    }
    
    println("-----------------------------------------------------")
    
    println("Alunos Matriculados:")
    for (aluno in formacaoBasica.inscritos) {
        println("- ${aluno.nome}, Idade: ${aluno.idade}")
    }
    for (aluno in formacaoIntermediaria.inscritos) {
        println("- ${aluno.nome}, Idade: ${aluno.idade}")
    }
    for (aluno in formacaoAvancada.inscritos) {
        println("- ${aluno.nome}, Idade: ${aluno.idade}")
    }
    
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}