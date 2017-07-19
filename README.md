# SlackBot

Este projeto provê um jar para enviar mensagens para canais do Slack.

## FAQ
### Como posso testar?

Use o Docker para baixar a imagem e executar um container para testes.

- Baixe a imagem executando o docker pull:
```shell
docker pull seniocaires/slackbot
```
- Para iniciar um container da imagem recém baixada:
```shell
docker run --rm -e MENSAGEM=Hello -e CANAIS=general,canalxyz -e TOKEN=token-slack-bot seniocaires/slackbot
```

### Quais parâmetros são necessários (variáveis de ambiente)?
 - MENSAGEM : Mensagem a ser enviada para os canais.
 - CANAIS : Canais do Slack que serão informados quando alguma das URLs não responder com HTTP Status Code 200. Separados por vírgula.
 - TOKEN : Token do Bot no Slack.
