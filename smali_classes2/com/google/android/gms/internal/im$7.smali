.class Lcom/google/android/gms/internal/im$7;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/jw$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/ij;I)Lcom/google/android/gms/internal/ij;
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
.field final synthetic a:I

.field final synthetic b:Lcom/google/android/gms/internal/im;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/im;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/im$7;->b:Lcom/google/android/gms/internal/im;

    iput p2, p0, Lcom/google/android/gms/internal/im$7;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/jw;)V
    .locals 2
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

    iget-object v0, p0, Lcom/google/android/gms/internal/im$7;->b:Lcom/google/android/gms/internal/im;

    iget v1, p0, Lcom/google/android/gms/internal/im$7;->a:I

    invoke-static {v0, p1, v1}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/jw;I)V

    return-void
.end method
