.class Lcom/google/firebase/database/g$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/database/g;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/firebase/database/g;


# direct methods
.method constructor <init>(Lcom/google/firebase/database/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/database/g$1;->a:Lcom/google/firebase/database/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/g$1;->a:Lcom/google/firebase/database/g;

    invoke-static {v0}, Lcom/google/firebase/database/g;->a(Lcom/google/firebase/database/g;)Lcom/google/android/gms/internal/im;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/im;->g()V

    return-void
.end method
