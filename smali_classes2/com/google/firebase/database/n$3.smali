.class Lcom/google/firebase/database/n$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/database/n;->b(Lcom/google/android/gms/internal/ie;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ie;

.field final synthetic b:Lcom/google/firebase/database/n;


# direct methods
.method constructor <init>(Lcom/google/firebase/database/n;Lcom/google/android/gms/internal/ie;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/database/n$3;->b:Lcom/google/firebase/database/n;

    iput-object p2, p0, Lcom/google/firebase/database/n$3;->a:Lcom/google/android/gms/internal/ie;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/database/n$3;->b:Lcom/google/firebase/database/n;

    iget-object v0, v0, Lcom/google/firebase/database/n;->a:Lcom/google/android/gms/internal/im;

    iget-object v1, p0, Lcom/google/firebase/database/n$3;->a:Lcom/google/android/gms/internal/ie;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/im;->b(Lcom/google/android/gms/internal/ie;)V

    return-void
.end method
