//  A DIO possui Formacoes incríveis que têm como objetivo oferecer um conjunto de ConteudosEducacionais
//  voltados para uma stack tecnológica específica, preparando profissionais de TI para o mercado de trabalho.
//  Formacoes possuem algumas características importantes, como nome, nivel e seus respectivos conteudosEducacionais.
//  Além disso, tais experiências educacionais têm um comportamento relevante ao nosso domínio,
//  definido pela capacidade de matricular um ou mais Alunos.

// 1 - Criar a capacidade de matricular um ou mais Alunos; - Concluido
// 2 - Voltados para uma Stack tecnológica específica - Back-end; 
// 3 - Formações possuem característica importantes: nome, nvl e seus respectivos conteudosEducacionais.


enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Aluno(val nome: String, val idade: Int)

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
        // Criar alguns conteúdos educacionais
    val conteudo1 = ConteudoEducacional("Introdução à Programação", "Aprenda os conceitos básicos de programação.")
    val conteudo2 = ConteudoEducacional("Desenvolvimento Web", "Aprenda a criar aplicativos web.")
    val conteudo3 = ConteudoEducacional("Banco de Dados", "Aprenda a trabalhar com bancos de dados.")

    // Criar uma formação com esses conteúdos (nível básico)
    val formacaoBasica = Formacao("Formação Básica de Desenvolvedor", Nivel.BASICO, listOf(conteudo1, conteudo2))

    // Criar uma formação com esses conteúdos (nível intermediário)
    val formacaoIntermediaria = Formacao("Formação Intermediária de Desenvolvedor", Nivel.INTERMEDIARIO, listOf(conteudo2, conteudo3))

    // Criar alguns alunos
    val aluno1 = Aluno("João", 25)
    val aluno2 = Aluno("Maria", 22)
    val aluno3 = Aluno("Pedro", 30)

    // Matricular os alunos nas formações
    formacaoBasica.matricular(aluno1)
    formacaoBasica.matricular(aluno2)

    formacaoIntermediaria.matricular(aluno2)
    formacaoIntermediaria.matricular(aluno3)

    // Exibir informações sobre as formações e os alunos matriculados
    println("Formação: ${formacaoBasica.nome}, Nível: ${formacaoBasica.nivel}")
    println("Conteúdos Educacionais:")
    for (conteudo in formacaoBasica.conteudos) {
        println("- ${conteudo.nome}: ${conteudo.descricao}")
    }
    println("Alunos Matriculados:")
    for (aluno in formacaoBasica.inscritos) {
        println("- ${aluno.nome}, Idade: ${aluno.idade}")
    }
    
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}