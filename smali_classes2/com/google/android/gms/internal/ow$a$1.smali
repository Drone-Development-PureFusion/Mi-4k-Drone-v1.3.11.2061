.class Lcom/google/android/gms/internal/ow$a$1;
.super Lcom/google/android/gms/internal/ow$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ow$a;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ow$c",
        "<",
        "Ljava/util/Map$Entry",
        "<TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ow$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ow$a;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/ow$a$1;->a:Lcom/google/android/gms/internal/ow$a;

    iget-object v0, p1, Lcom/google/android/gms/internal/ow$a;->a:Lcom/google/android/gms/internal/ow;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ow$c;-><init>(Lcom/google/android/gms/internal/ow;Lcom/google/android/gms/internal/ow$1;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ow$a$1;->b()Lcom/google/android/gms/internal/ow$d;

    move-result-object v0

    return-object v0
.end method

.method public synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ow$a$1;->a()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
