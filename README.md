# clevertec_06_cache_proxy
Task
1.	Создать любой gradle проект
2.	Проект должен быть совместим с java 17
3.	Придерживаться GitFlow: master -> develop -> feature/fix
4.	Создать реализацию кэша, используя алгоритмы LRU и LFU
5.	Создать в приложении слои service и dao (service будет вызывать слой dao, слой dao будет временная замена database). В этих сервисах реализовать CRUD операции для работы с entity. Работу организовать через интерфейсы.
6.	Результат работы dao должен синхронизироваться с кешем через proxy (или кастомная аннотация, или АОП/aspectj). При работе с entity оперируем id. Алгоритм работы с кешем:
●	GET - ищем в кеше и если там данных нет, то достаем объект из dao, сохраняем в кеш и возвращаем
●	POST - сохраняем в dao и потом сохраняем в кеше
●	DELETE - удаляем из dao и потом удаляем из кеша
●	PUT - обновление/вставка в dao и потом обновление/вставка в кеше
7.	Алгоритм и максимальный размер коллекции должны читаться из файла resources/application.yml
8.	Создать entity, в нем должно быть поле id и еще минимум 4 поля 
9.	Service работает с dto
10.	Объекты (dto), которые принимает service, должны валидироваться. В т.ч. добавить regex валидацию
11.	 Кеши должны быть покрыты unit tests 
12.	 Должен содержать javadoc и описанный README.md
13.	 Использовать lombok
14.	 *Реализовать метод для получения информации в формате xml
15.	 Заполнить и отправить форму


Доп. задание:
***Самописный JsonParser подтягивать как библиотеку и парсировать json через него
***В самописный JsonParser добавить возможность работы с xml
 
Литература

Cache
Least Frequently Used (LFU) Cache Implementation - Dinesh on Java
Алгоритмы кэширования | Bimlibik
Creating a simple and generic cache manager in Java | by Marcello Passos | Medium

Proxy
Java Dynamic proxy mechanism and how Spring is using it | by Spac Valentin | Medium
Dynamic Proxies in Java | Baeldung
Proxy (Java SE 17 & JDK 17) (oracle.com)
Заместитель на Java (refactoring.guru)
