.class public final Lcom/google/firebase/appindexing/a/f;
.super Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/google/firebase/appindexing/a/b;
    .locals 1

    new-instance v0, Lcom/google/firebase/appindexing/a/b;

    invoke-direct {v0}, Lcom/google/firebase/appindexing/a/b;-><init>()V

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/appindexing/g;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/firebase/appindexing/g$a;

    invoke-direct {v0}, Lcom/google/firebase/appindexing/g$a;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/firebase/appindexing/g$a;->setUrl(Ljava/lang/String;)Lcom/google/firebase/appindexing/a/e;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/appindexing/g$a;

    invoke-virtual {v0, p0}, Lcom/google/firebase/appindexing/g$a;->setName(Ljava/lang/String;)Lcom/google/firebase/appindexing/a/e;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/appindexing/g$a;

    invoke-virtual {v0}, Lcom/google/firebase/appindexing/g$a;->build()Lcom/google/firebase/appindexing/g;

    move-result-object v0

    return-object v0
.end method

.method public static b()Lcom/google/firebase/appindexing/a/c;
    .locals 1

    new-instance v0, Lcom/google/firebase/appindexing/a/c;

    invoke-direct {v0}, Lcom/google/firebase/appindexing/a/c;-><init>()V

    return-object v0
.end method

.method public static c()Lcom/google/firebase/appindexing/a/c;
    .locals 2

    new-instance v0, Lcom/google/firebase/appindexing/a/c;

    const-string v1, "TextDigitalDocument"

    invoke-direct {v0, v1}, Lcom/google/firebase/appindexing/a/c;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static d()Lcom/google/firebase/appindexing/a/c;
    .locals 2

    new-instance v0, Lcom/google/firebase/appindexing/a/c;

    const-string v1, "PresentationDigitalDocument"

    invoke-direct {v0, v1}, Lcom/google/firebase/appindexing/a/c;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static e()Lcom/google/firebase/appindexing/a/c;
    .locals 2

    new-instance v0, Lcom/google/firebase/appindexing/a/c;

    const-string v1, "SpreadsheetDigitalDocument"

    invoke-direct {v0, v1}, Lcom/google/firebase/appindexing/a/c;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static f()Lcom/google/firebase/appindexing/a/c;
    .locals 2

    new-instance v0, Lcom/google/firebase/appindexing/a/c;

    const-string v1, "NoteDigitalDocument"

    invoke-direct {v0, v1}, Lcom/google/firebase/appindexing/a/c;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static g()Lcom/google/firebase/appindexing/a/g;
    .locals 1

    new-instance v0, Lcom/google/firebase/appindexing/a/g;

    invoke-direct {v0}, Lcom/google/firebase/appindexing/a/g;-><init>()V

    return-object v0
.end method

.method public static h()Lcom/google/firebase/appindexing/a/g;
    .locals 2

    new-instance v0, Lcom/google/firebase/appindexing/a/g;

    const-string v1, "EmailMessage"

    invoke-direct {v0, v1}, Lcom/google/firebase/appindexing/a/g;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static i()Lcom/google/firebase/appindexing/a/h;
    .locals 1

    new-instance v0, Lcom/google/firebase/appindexing/a/h;

    invoke-direct {v0}, Lcom/google/firebase/appindexing/a/h;-><init>()V

    return-object v0
.end method

.method public static j()Lcom/google/firebase/appindexing/a/i;
    .locals 1

    new-instance v0, Lcom/google/firebase/appindexing/a/i;

    invoke-direct {v0}, Lcom/google/firebase/appindexing/a/i;-><init>()V

    return-object v0
.end method

.method public static k()Lcom/google/firebase/appindexing/a/j;
    .locals 1

    new-instance v0, Lcom/google/firebase/appindexing/a/j;

    invoke-direct {v0}, Lcom/google/firebase/appindexing/a/j;-><init>()V

    return-object v0
.end method

.method public static l()Lcom/google/firebase/appindexing/a/k;
    .locals 1

    new-instance v0, Lcom/google/firebase/appindexing/a/k;

    invoke-direct {v0}, Lcom/google/firebase/appindexing/a/k;-><init>()V

    return-object v0
.end method

.method public static m()Lcom/google/firebase/appindexing/a/d;
    .locals 1

    new-instance v0, Lcom/google/firebase/appindexing/a/d;

    invoke-direct {v0}, Lcom/google/firebase/appindexing/a/d;-><init>()V

    return-object v0
.end method

.method public static n()Lcom/google/firebase/appindexing/a/l;
    .locals 1

    new-instance v0, Lcom/google/firebase/appindexing/a/l;

    invoke-direct {v0}, Lcom/google/firebase/appindexing/a/l;-><init>()V

    return-object v0
.end method
