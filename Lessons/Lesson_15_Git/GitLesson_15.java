public class GitLesson_15 {
   /*
   GIT - распределенная система контроля версий

Git — это набор консольных утилит, которые отслеживают и фиксируют изменения в файлах (чаще всего речь идет об исходном
коде программ, но вы можете использовать его для любых файлов на ваш вкус)

С его помощью вы можете сравнивать, анализировать, редактировать, сливать изменения и возвращаться назад к последнему
\сохранению. Этот процесс называется контролем версий.

Для чего он нужен?

Ну во-первых, чтобы отследить изменения, произошедшие с проектом, со временем. Во-вторых он чрезвычайно полезен при
одновременной работе нескольких специалистов, над одним проектом.

Git является распределенным, то есть не зависит от одного центрального сервера, на котором хранятся файлы.
Вместо этого он работает полностью локально, сохраняя данные в директориях на жестком диске, которые называются репозиторием.
Тем не менее, вы можете хранить копию репозитория онлайн, это сильно облегчает работу над одним проектом для нескольких людей.

Для этого используются сайты вроде github и bitbucket.

Часто используемые комманды

git init
Позволяет проинициализировать репозиторий в текущей папке

git status
Показывает текущий статус

git add

Отслеживает изменения файлов

git add index.html​
добавляет index.html

git add .
добавляет все файлы в проекте

git commit
Сохраняет изменения в коммит

git commit -m 'commit message'
создает коммит с сообщением

git branch

Работа с ветками в репозитории

git branch
показывает список веток

git branch branch-name
создает новую ветку branch-name

git branch -D branch-name
удаляет ветку branch-name

git checkout
Переключается на другую ветку

git checkout branch-name
переключается на последний коммит в ветке branch-name

git checkout -b branch-name
создает и переключается на ветку branch-name

git merge Совмещает текущую ветку с выбранной

git merge branch-name
совмещает текущую ветку с branch-name

git config

Конфигурация и параметры git

git config --global user.name
Показывает имя пользователя

git config --global user.name “new user”
Изменяет имя пользователя

git config --global user.email
Показывает email пользователя

git config --global user.email “test@mail.com”
Изменяет email пользователя

git remote add origin https://github.com/tutorial/awesome-project.git
Связать локальный репозиторий с репозиторием на GitHub

git push
Заливает текущие локальные коммиты в удаленный репозиторий

git pull
Забирает изменения с удаленного репозитория в локальный

git clone
Клонирует проект с удаленного репозитория
    */

    /**Настройка git
     Перед началом работы необходимо сообщить ​git, ​кто вы и как вас представлять другим участникам распределенной
     системы контроля версий. Пока вы не подпишетесь, система не даст вам регистрировать снимки проекта, коммиты.

     Все ваши изменения должны быть подписаны вашим именем и электронным адресом, чтобы другие участники проекта знали,
     чьи это правки и как с вами связаться. Сделать это нужно один раз, как правило, сразу после установки git, если вы
     переустановите систему, процедуру потребуется повторить.

     Чтобы задать ваши имя и электронный адрес, следует воспользоваться командой ​git config:​

     git config --global user.name "John Doe"
     git config --global user.email johndoe@example03.com
     Убедиться в том, что настройки успешно установлены, можно, запросив их список при помощи команды ​git config --list.​

     Она выдает множество настроек, в том числе и только что установленные значения.

     user.name=John Doe
     user.email=johndoe@example03.com
     Файл .gitignore
     Файл .gitignore для работы с проектом в IntelliJ Idea должен включать в себя следующие строчки:

     .idea/
     *.iml*/
}
