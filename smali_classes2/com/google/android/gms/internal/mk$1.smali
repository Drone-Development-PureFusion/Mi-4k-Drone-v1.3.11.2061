.class final Lcom/google/android/gms/internal/mk$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/database/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/mk;->a(Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/internal/mh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/g/g;


# direct methods
.method constructor <init>(Lcom/google/android/gms/g/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mk$1;->a:Lcom/google/android/gms/g/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/firebase/database/c;Lcom/google/firebase/database/e;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/mk$1;->a:Lcom/google/android/gms/g/g;

    invoke-virtual {p1}, Lcom/google/firebase/database/c;->d()Lcom/google/firebase/database/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/mk$1;->a:Lcom/google/android/gms/g/g;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method
