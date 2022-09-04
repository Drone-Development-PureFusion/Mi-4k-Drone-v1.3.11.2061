.class public Lcom/google/android/gms/awareness/fence/e$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/awareness/fence/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/awareness/fence/e$a;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public a(Landroid/app/PendingIntent;)Lcom/google/android/gms/awareness/fence/e$a;
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/awareness/fence/e$a;->a:Ljava/util/ArrayList;

    invoke-static {p1}, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->a(Landroid/app/PendingIntent;)Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/awareness/fence/e$a;
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/awareness/fence/e$a;->a:Ljava/util/ArrayList;

    invoke-static {p1}, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->a(Ljava/lang/String;)Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public a(Ljava/lang/String;Lcom/google/android/gms/awareness/fence/AwarenessFence;Landroid/app/PendingIntent;)Lcom/google/android/gms/awareness/fence/e$a;
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/awareness/fence/e$a;->a:Ljava/util/ArrayList;

    check-cast p2, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->a(Ljava/lang/String;Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;Landroid/app/PendingIntent;)Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public a()Lcom/google/android/gms/awareness/fence/e;
    .locals 2

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/FenceUpdateRequestImpl;

    iget-object v1, p0, Lcom/google/android/gms/awareness/fence/e$a;->a:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lcom/google/android/gms/contextmanager/fence/internal/FenceUpdateRequestImpl;-><init>(Ljava/util/ArrayList;)V

    return-object v0
.end method
