# InfoBook App

### Описание

Мобильное приложение: электронная сервисная книжка для автомобиля

### Требования заказчика

- Сведения об автомобиле
- Сведения о собственнике
- Список предыдущих ТО
    - Возможность добавлять в список записи о ТО
    - При нажатии на элемент списка отображается подробная информация

### Примерная архитектура

Используем Kotlin

Скомпилировано под Android SDK 32

Минимальная поддерживаемая версия Android SDK 23

#### Компоненты
1. Список автомобилей
2. Окно регистрации
3. Основное окно приложения
4. БД для хранения данных

### План работы

- Создать Github репозиторий
- Продумать архитектуру
- Разработка приложения в порядке 1, 2, 3, 4

### Результаты первого дня
- Добавлены главный экран, экран добавления информации о машины. Данные передаются с одного экрана на другой через Android Result Api
- Верстка компонентов
- UI-тесты на отображение главных элементов с помощью библиотеки Espresso 

### Схема приложения

![](./images/InfoBook.png)
