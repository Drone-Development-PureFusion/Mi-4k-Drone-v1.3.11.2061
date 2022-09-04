.class public final Lcom/google/firebase/appindexing/internal/c;
.super Lcom/google/firebase/appindexing/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/appindexing/internal/c$c;,
        Lcom/google/firebase/appindexing/internal/c$b;,
        Lcom/google/firebase/appindexing/internal/c$a;
    }
.end annotation


# instance fields
.field private c:Lcom/google/firebase/appindexing/internal/c$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/google/firebase/appindexing/internal/c$a;

    invoke-direct {v0, p1}, Lcom/google/firebase/appindexing/internal/c$a;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, p1, v0}, Lcom/google/firebase/appindexing/internal/c;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/u;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/api/u;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/common/api/u;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/common/api/u",
            "<",
            "Lcom/google/android/gms/common/api/a$a$b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/appindexing/b;-><init>()V

    new-instance v0, Lcom/google/firebase/appindexing/internal/c$c;

    invoke-direct {v0, p2}, Lcom/google/firebase/appindexing/internal/c$c;-><init>(Lcom/google/android/gms/common/api/u;)V

    iput-object v0, p0, Lcom/google/firebase/appindexing/internal/c;->c:Lcom/google/firebase/appindexing/internal/c$c;

    return-void
.end method


# virtual methods
.method public varargs a([Lcom/google/firebase/appindexing/g;)Lcom/google/android/gms/g/f;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/google/firebase/appindexing/g;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Indexables cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/g/i;->a(Ljava/lang/Exception;)Lcom/google/android/gms/g/f;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    array-length v0, p1

    new-array v0, v0, [Lcom/google/firebase/appindexing/internal/Thing;

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    array-length v3, p1

    invoke-static {p1, v1, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Ljava/lang/ArrayStoreException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Lcom/google/firebase/appindexing/internal/c;->c:Lcom/google/firebase/appindexing/internal/c$c;

    new-instance v2, Lcom/google/firebase/appindexing/internal/c$1;

    invoke-direct {v2, p0, v0}, Lcom/google/firebase/appindexing/internal/c$1;-><init>(Lcom/google/firebase/appindexing/internal/c;[Lcom/google/firebase/appindexing/internal/Thing;)V

    invoke-virtual {v1, v2}, Lcom/google/firebase/appindexing/internal/c$c;->a(Lcom/google/firebase/appindexing/internal/c$b;)Lcom/google/android/gms/g/f;

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v0, Lcom/google/firebase/appindexing/d;

    const-string v1, "Custom Indexable-objects are not allowed. Please use the \'Indexables\'-class for creating the objects."

    invoke-direct {v0, v1}, Lcom/google/firebase/appindexing/d;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/g/i;->a(Ljava/lang/Exception;)Lcom/google/android/gms/g/f;

    move-result-object v0

    goto :goto_0
.end method

.method public varargs a([Ljava/lang/String;)Lcom/google/android/gms/g/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/appindexing/internal/c;->c:Lcom/google/firebase/appindexing/internal/c$c;

    new-instance v1, Lcom/google/firebase/appindexing/internal/c$2;

    invoke-direct {v1, p0, p1}, Lcom/google/firebase/appindexing/internal/c$2;-><init>(Lcom/google/firebase/appindexing/internal/c;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/firebase/appindexing/internal/c$c;->a(Lcom/google/firebase/appindexing/internal/c$b;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/google/android/gms/g/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/appindexing/internal/c;->c:Lcom/google/firebase/appindexing/internal/c$c;

    new-instance v1, Lcom/google/firebase/appindexing/internal/c$3;

    invoke-direct {v1, p0}, Lcom/google/firebase/appindexing/internal/c$3;-><init>(Lcom/google/firebase/appindexing/internal/c;)V

    invoke-virtual {v0, v1}, Lcom/google/firebase/appindexing/internal/c$c;->a(Lcom/google/firebase/appindexing/internal/c$b;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method
