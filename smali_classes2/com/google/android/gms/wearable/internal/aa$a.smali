.class final Lcom/google/android/gms/wearable/internal/aa$a;
.super Lcom/google/android/gms/wearable/internal/ba;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/internal/aa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/ba",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/wearable/m$b;

.field private b:Lcom/google/android/gms/internal/ail;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/wearable/m$b;",
            ">;"
        }
    .end annotation
.end field

.field private c:[Landroid/content/IntentFilter;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/m$b;Lcom/google/android/gms/internal/ail;[Landroid/content/IntentFilter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/wearable/m$b;",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/wearable/m$b;",
            ">;[",
            "Landroid/content/IntentFilter;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/wearable/internal/ba;-><init>(Lcom/google/android/gms/common/api/g;)V

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/m$b;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/aa$a;->a:Lcom/google/android/gms/wearable/m$b;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ail;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/aa$a;->b:Lcom/google/android/gms/internal/ail;

    invoke-static {p4}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/content/IntentFilter;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/aa$a;->c:[Landroid/content/IntentFilter;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/m$b;Lcom/google/android/gms/internal/ail;[Landroid/content/IntentFilter;Lcom/google/android/gms/wearable/internal/aa$1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/wearable/internal/aa$a;-><init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/m$b;Lcom/google/android/gms/internal/ail;[Landroid/content/IntentFilter;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/aa$a;->a:Lcom/google/android/gms/wearable/m$b;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/aa$a;->b:Lcom/google/android/gms/internal/ail;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/aa$a;->c:[Landroid/content/IntentFilter;

    return-object p1
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/wearable/internal/ar;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/aa$a;->a(Lcom/google/android/gms/wearable/internal/ar;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/wearable/internal/ar;)V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aa$a;->a:Lcom/google/android/gms/wearable/m$b;

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/aa$a;->b:Lcom/google/android/gms/internal/ail;

    iget-object v2, p0, Lcom/google/android/gms/wearable/internal/aa$a;->c:[Landroid/content/IntentFilter;

    invoke-virtual {p1, p0, v0, v1, v2}, Lcom/google/android/gms/wearable/internal/ar;->a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/wearable/m$b;Lcom/google/android/gms/internal/ail;[Landroid/content/IntentFilter;)V

    iput-object v3, p0, Lcom/google/android/gms/wearable/internal/aa$a;->a:Lcom/google/android/gms/wearable/m$b;

    iput-object v3, p0, Lcom/google/android/gms/wearable/internal/aa$a;->b:Lcom/google/android/gms/internal/ail;

    iput-object v3, p0, Lcom/google/android/gms/wearable/internal/aa$a;->c:[Landroid/content/IntentFilter;

    return-void
.end method

.method public synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/aa$a;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method
