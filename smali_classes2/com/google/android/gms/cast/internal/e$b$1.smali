.class Lcom/google/android/gms/cast/internal/e$b$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/internal/e$b;->e(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/cast/internal/e;

.field final synthetic b:I

.field final synthetic c:Lcom/google/android/gms/cast/internal/e$b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/internal/e$b;Lcom/google/android/gms/cast/internal/e;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/internal/e$b$1;->c:Lcom/google/android/gms/cast/internal/e$b;

    iput-object p2, p0, Lcom/google/android/gms/cast/internal/e$b$1;->a:Lcom/google/android/gms/cast/internal/e;

    iput p3, p0, Lcom/google/android/gms/cast/internal/e$b$1;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e$b$1;->a:Lcom/google/android/gms/cast/internal/e;

    invoke-static {v0}, Lcom/google/android/gms/cast/internal/e;->c(Lcom/google/android/gms/cast/internal/e;)Lcom/google/android/gms/cast/a$d;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/cast/internal/e$b$1;->b:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/a$d;->a(I)V

    return-void
.end method
