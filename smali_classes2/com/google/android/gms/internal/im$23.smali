.class Lcom/google/android/gms/internal/im$23;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/jw$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/im;->b(Lcom/google/android/gms/internal/jw;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/jw$b",
        "<",
        "Ljava/util/List",
        "<",
        "Lcom/google/android/gms/internal/im$a;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/im;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/im;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/im$23;->a:Lcom/google/android/gms/internal/im;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/jw;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/jw",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/im$a;",
            ">;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/im$23;->a:Lcom/google/android/gms/internal/im;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/im;->b(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/jw;)V

    return-void
.end method
